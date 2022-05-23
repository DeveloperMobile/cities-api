package com.github.developermobile.citiesapi.state.entity;

import java.util.List;
import javax.persistence.*;

import com.github.developermobile.citiesapi.country.entity.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome")
  private String name;

  private String uf;

  private Integer ibge;

  // 1st
//  @Column(name = "pais")
//  private Integer countryId;

  // 2nd - @ManyToOne
  @ManyToOne
  @JoinColumn(name = "pais", referencedColumnName = "id")
  private Country country;

  @Type(type = "jsonb")
  @Basic(fetch = FetchType.LAZY)
  @Column(name = "ddd", columnDefinition = "jsonb")
  private List<Integer> ddd;

  /*public Integer getCountryId() {
      return countryId;
  }*/
}
