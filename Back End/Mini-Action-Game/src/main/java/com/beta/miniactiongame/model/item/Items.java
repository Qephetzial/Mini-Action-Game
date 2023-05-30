package com.beta.miniactiongame.model.item;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
//This class is the core of every item. All the item must be inherited from this class.
public abstract class Items {

    //A unique ID to the item.
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    //This field determines the item name.
    private String name;

    //This field determines how rare the item is. Also, the ENUM contains the worth of the item.
    private Rarity rarity;

    //This field determines the image represented on the front-end.
    private String png;

    //This field determines the item's type.
    private ItemType itemType;
}
