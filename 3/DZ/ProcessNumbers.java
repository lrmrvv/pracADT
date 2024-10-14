public void ProcessNumbers(int[] numbers) {

    if (numbers == null || numbers.length == 0) {
        return;
    }
    
    for (int number : numbers) {
        if (number > 0) {
            System.out.println(number);
        }
    }
}
