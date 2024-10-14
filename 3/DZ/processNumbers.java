public void processNumbers(int[] numbers) {
    if (isValid(numbers)) {
        for (int number : numbers) {
            printIfPositive(number);
        }
    }
}

private boolean isValid(int[] numbers) {
    return numbers != null && numbers.length > 0;
}

private void printIfPositive(int number) {
    if (number > 0) {
        System.out.println(number);
    }
}
