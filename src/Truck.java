public class Truck {
    private String modelName;
    private int wheelsCount;
    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку у " + modelName);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + modelName);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у " + modelName);
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}