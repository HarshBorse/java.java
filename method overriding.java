class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}


class Child extends Parent {

    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}
