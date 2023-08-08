	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String result = rearrangeString(input);
		System.out.println(result);
	}

	private static String rearrangeString(String input) {
		StringBuilder alphabets = new StringBuilder();
		StringBuilder specialSymbols = new StringBuilder();
		StringBuilder numbers = new StringBuilder();

		for (char ch : input.toCharArray()) {
			if (Character.isAlphabetic(ch))
				alphabets.append(ch);
			else if (isSpecialSymbol(ch))
				specialSymbols.append(ch);
			else if (Character.isDigit(ch))
				numbers.append(ch);
		}

		// Sort the numbers in ascending order
		char[] sortedNumbers = numbers.toString().toCharArray();
		Arrays.sort(sortedNumbers);

		return alphabets.toString() + specialSymbols.toString() + new String(sortedNumbers);
	}

	private static boolean isSpecialSymbol(char ch) {
		return ch == '!' || ch == '#' || ch == '$' || ch == '%' || ch == '*' || ch == '(' || ch == ')';
	}

