import DAOs.OwnerDAO;
import Entities.Owner;
import Servicies.OwnerService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class OwnerServiceTests {
    @Mock
    private OwnerDAO ownerDAO;

    @InjectMocks
    private OwnerService ownerService;

    private static Owner owner1;
    private static Owner owner2;

    @BeforeClass
    public static void db() {
        owner1 = Owner.builder()
                .name("Sasha")
                .birthDate(LocalDate.of(2005, 7, 31))
                .build();

        owner2 = Owner.builder()
                .name("Huyasha")
                .birthDate(LocalDate.of(2005, 7, 31))
                .build();
    }

    @Test
    public void testGetOwnerByIdTest() {
        when(ownerDAO.getById(anyInt())).thenReturn(owner1);

        Owner result = ownerService.getOwnerById(1);

        assertEquals(owner1, result);
    }

    @Test
    public void testGetAllOwners() {
        List<Owner> expectOwners = Arrays.asList(owner1, owner2);
        when(ownerDAO.getAll()).thenReturn(expectOwners);

        List<Owner> result = ownerService.getAllOwners();

        assertEquals(expectOwners, result);
    }

    @Test
    public void testGetOwnerAmount() {
        when(ownerDAO.getCount()).thenReturn(10L);

        Long result = ownerService.getOwnerAmount();

        assertEquals(Long.valueOf(10), result);
    }

    @Test
    public void testAddOwner() {
        ownerService.addOwner(owner1);

        verify(ownerDAO).save(owner1);
    }

    @Test
    public void testDeleteOwner() {
        ownerService.deleteOwner(owner1);

        verify(ownerDAO).delete(owner1);
    }

    @Test
    public void testDeleteOwnerById() {
        when(ownerDAO.getById(anyInt())).thenReturn(owner1);

        ownerService.deleteOwnerById(1);


        verify(ownerDAO).getById(1);
        verify(ownerDAO).delete(owner1);
    }
}
