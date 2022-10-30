package data;

public enum CourcesData {
  Testing("Тестирование");

  private String name;

  CourcesData(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
}

