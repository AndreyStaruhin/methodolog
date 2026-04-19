class ClassicPair {
    public ClassicPair(String first, Integer second) {
        this.second = second;
        this.first = first;
    }

    public String getFirst() {
        return first;
    }


    public Integer getSecond() {
        return second;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        ClassicPair that = (ClassicPair) object;
        return java.util.Objects.equals(first, that.first) && java.util.Objects.equals(second, that.second);
    }

    public int hashCode() {
        return java.util.Objects.hash(first, second);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ClassicPair{" +
                "first='" + first + '\'' +
                ", second=" + second +
                '}';
    }

    final String first;
    final Integer second;

    static void main(String[] args) {
        var a = new ClassicPair("1", 1);
    }
}


/*
 Будут сгенерированны: геттеры, конструктор со всеми параметрами, методы для сравнения двух записей как типов-значений
 */
record RecordPair(String first, Integer second) {
   //Придумал не я, claaude - здесь мой пробел
    public RecordPair {   // ← нет круглых скобок с параметрами
        if (first == null || first.isBlank()) {
            throw new IllegalArgumentException("first must be non-blank");
        }
        if (second == null || second < 0) {
            throw new IllegalArgumentException("second must be non-negative");
        }
    }
}
