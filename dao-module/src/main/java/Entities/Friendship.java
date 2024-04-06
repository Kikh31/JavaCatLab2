package Entities;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="friendships")
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friendship_id")
    private Integer friendshipId;

    //private Integer catId;
    @ManyToOne
    @JoinColumn(name="cat_id")
    private Cat cat;

    //private Integer friendId;
    @ManyToOne
    @JoinColumn(name="friend_id")
    private Cat friend;
}
