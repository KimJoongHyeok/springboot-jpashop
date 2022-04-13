package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    //JPA 스펙상 생성 , JPA 구현 라이브러리가 객체를 생성할 때 리플렉션,프록시과 같은 기술을 사용할 수 있도록 지원해야하기 때문
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
