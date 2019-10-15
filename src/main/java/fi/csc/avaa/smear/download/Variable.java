package fi.csc.avaa.smear.download;

public  class Variable  {
    private String variable;
    private String description;
    private String  source;
    private int availability; //%
    private boolean download;
    private boolean select;

    public Variable() {
        this.select = false;
    }

    public Variable(String variable, String description, String  source) {
        this.variable = variable;
        this.description = description;
        this.source = source;
        this.select = false;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public boolean isDownload() {
        return download;
    }

    public void setDownload(boolean doanload) {
        this.download = doanload;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }
}
