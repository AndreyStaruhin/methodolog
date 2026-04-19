class ClassicPair {
    public ClassicPair(Integet second, String first) {
        this.second = second;
        this.first = first;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Integet getSecond() {
        return second;
    }

    public void setSecond(Integet second) {
        this.second = second;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ClassicPair that = (ClassicPair) object;
        return java.util.Objects.equals(first, that.first) && java.util.Objects.equals(second, that.second);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), first, second);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ClassicPair{" +
                "first='" + first + '\'' +
                ", second=" + second +
                '}';
    }

    String first;
    Integet second;
}

/*
   Для записей не нужно реализовывать сравнение самостоятельно, так как они относятся к типам
   значений. Как мфлидировать данные - не совсем понимаю, мозможно, сделать специальный метод валидации
   Ещё вариант - создавать с помощью статическокого фаблричного метода внутри
 */
record RecordPair(String first, Integer second) {

}