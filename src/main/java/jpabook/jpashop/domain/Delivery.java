package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery",fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) //꼭 STRING으로 사용해야함, default 는 ORDINAL인데 인덱스처럼 숫자로 들어가게 되서 나중에 중간값이 추가되면 밀려서 다른값이 나오는 오류 발생
    private DeliveryStatus status; //READY, COMP
}
