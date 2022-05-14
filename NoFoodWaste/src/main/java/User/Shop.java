package User;

import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
@EqualsAndHashCode
@Table(name = "shop", schema = "public")
@SpringBootApplication
public class Shop {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

}
