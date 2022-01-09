package pattern.behavioral.visit.visitee;

import pattern.behavioral.visit.visitor.ShopItemVisitor;

public class ConcreteShopItem1 extends ShopItem{

    @Override
    public void accept(ShopItemVisitor visitor) {
        visitor.visit(this);
    }
}
