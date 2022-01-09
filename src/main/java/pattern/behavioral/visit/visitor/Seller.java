package pattern.behavioral.visit.visitor;

import pattern.behavioral.visit.visitee.ConcreteShopItem1;
import pattern.behavioral.visit.visitee.ConcreteShopItem2;

public class Seller extends ShopItemVisitor {

    @Override
    public void visit(ConcreteShopItem1 shopItem) {
        System.out.println("sell ConcreteShopItem1");
    }

    @Override
    public void visit(ConcreteShopItem2 shopItem) {
        System.out.println("sell ConcreteShopItem2");
    }
}
