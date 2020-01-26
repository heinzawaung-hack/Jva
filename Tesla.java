class Tesla extends Car{

    public Tesla(String model, int cylinder) {
        super(model, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getName();
    }

    @Override
    public String accelerate() {
        return  getClass().getName() + ", This acceleration is Fucking High..This is Tesla";
    }

    @Override
    public String brakeSystem() {
        return "Tesla Break System";
    }
}


