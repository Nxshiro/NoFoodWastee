package com.nofoodwaste.app.User;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
@EqualsAndHashCode
@Table(name = "User", schema = "public")
public class User {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "password")
	private String password;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	private Role role;

	@JoinColumn(name = "shop_id")
	private Shop shop;

	public String getMail() {
		return this.email;
	}




}
