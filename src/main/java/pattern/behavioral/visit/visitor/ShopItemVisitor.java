package pattern.behavioral.visit.visitor;

import pattern.behavioral.visit.visitee.ConcreteShopItem1;
import pattern.behavioral.visit.visitee.ConcreteShopItem2;

public abstract class ShopItemVisitor {

    public abstract void visit(ConcreteShopItem1 shopItem);
    public abstract void visit(ConcreteShopItem2 shopItem);

}
