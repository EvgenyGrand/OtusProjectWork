package data;

public enum QACourceData {
    QALead("QA Lead", CourcesData.Testing);

    private String name;
    private CourcesData courcesData;

    QACourceData(String name, CourcesData courcesData){
        this.name=name;
        this.courcesData=courcesData;

    }
    public String getName(){
        return name;
    }
    public CourcesData getCourcesData(){
        return courcesData;
    }

}
