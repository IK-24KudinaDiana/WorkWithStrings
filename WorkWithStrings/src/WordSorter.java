import java.util.Scanner;

public class WordSorter {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВведіть текст: ");
            StringBuffer text = new StringBuffer(scanner.nextLine());

            System.out.print("Введіть літеру для сортування: ");
            char targetLetter = scanner.next().charAt(0);

            try {
                StringBuffer sortedWords = sortWordsByLetterCount(text, targetLetter);
                System.out.println("Відсортовані слова: " + sortedWords);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Помилка: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Сталася непередбачена помилка: " + e.getMessage());
            }
        }
    }

    public static StringBuffer sortWordsByLetterCount(StringBuffer text, char targetLetter) {
        if (text == null || text.length() == 0) {
            throw new IllegalArgumentException("Текст не може бути порожнім або null.");
        }
        if (Character.isDigit(targetLetter)) {
            throw new IllegalArgumentException("Задана літера не повинна бути цифрою.");
        }

        String[] wordsArray = text.toString().split("\\s+");
        StringBuffer[] words = new StringBuffer[wordsArray.length];
        for (int i = 0; i < wordsArray.length; i++) {
            words[i] = new StringBuffer(wordsArray[i]);
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int count1 = countOccurrences(words[i], targetLetter);
                int count2 = countOccurrences(words[j], targetLetter);
                if (count1 > count2) {
                    StringBuffer temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        StringBuffer sortedText = new StringBuffer();
        for (StringBuffer word : words) {
            if (sortedText.length() > 0) {
                sortedText.append(" ");
            }
            sortedText.append(word);
        }

        return sortedText;
    }

    private static int countOccurrences(StringBuffer word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
