package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="items")
public class Items extends AuditModelItems{
    @Id //column id merupakan primary key
    @SequenceGenerator(
            name = "itemsSequence",
            sequenceName = "items_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(generator = "itemsSequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer id;


    @Column(name = "name")
    public String name;

    @Column(name = "count")
    public Integer count;

    @Column(name = "price")
    public Integer price;

    @Column(name = "type")
    public String type;

    @Column(name = "description")
    public String description;
}
