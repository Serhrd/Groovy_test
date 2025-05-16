class CountElementsGroovy {
    static Map countElements(List list) {
        list.countBy { it }
    }

    static void main(String[] args) {
        def input = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(input)
        println "Groovy: $result"
    }
}
