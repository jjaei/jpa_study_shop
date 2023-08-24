package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {
    private String memberName;  // 회원 이름
    private String orderStatus;  // 주문 상태(ORDER, CANCEL)
}
