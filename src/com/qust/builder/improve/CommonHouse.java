package com.qust.builder.improve;

public class CommonHouse extends  HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基三米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙三米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶白色");
    }
}
