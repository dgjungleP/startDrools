package entity;

public class School {
    private String className;
    private String classCount;
    private String[] classNameArray;

    public String[] getClassNameArray() {
        return classNameArray;
    }

    public void setClassNameArray(String[] classNameArray) {
        this.classNameArray = classNameArray;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCount() {
        return classCount;
    }

    public void setClassCount(String classCount) {
        this.classCount = classCount;
    }
}
