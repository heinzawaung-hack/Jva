class Ferrari extends Car{

    public Ferrari(String model, int cylinder) {
        super(model, cylinder);
    }

    @Override
    public String startEngine() {
        return "Ferrari Engine is now starting";
    }

    @Override
    public String accelerate() {
        return "This acceleration is Fucking High..This is Ferrari";
    }

    @Override
    public String brakeSystem() {
        return "Ferrari Break System";
    }
}


