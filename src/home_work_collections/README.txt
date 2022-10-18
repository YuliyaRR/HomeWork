Коллекции, полиморфизм, DTO, Supplier*, Comparator

1.1. Написать класс Person
Person

1.2. Написать класс Animal
Animal

2. Для имён:
2.1 Генерировать рандомную строку (не важно из чего состоит)
IStringGenerator
GeneratorRandomEngNumString

2.2 Генерировать рандомную строку (состоящую из русских букв)
GeneratorRandomRusString

2.3 Генерировать рандомное имя (настоящее имя)
GeneratorRandomName

2.4* Генерировать рандомное имя (имена получать из файла)
GeneratorRandomNameFromFile -> Name.txt

3. Для клички:
3.1 Генерировать рандомную строку (не важно из чего состоит)
GeneratorRandomEngNumString

3.2 Генерировать рандомную строку (состоящую из русских букв)
GeneratorRandomRusString

3.3 Генерировать рандомное имя (настоящие клички животных)
GeneratorRandomNickAnimal

3.4* Генерировать рандомное имя (клички получать из файла)
GeneratorRandomNickAnimalFromFile -> NickAnimal.txt

4. Для псевдонимов:
4.1 Генерировать рандомную строку (не важно из чего состоит)
GeneratorRandomEngNumString

4.2 Генерировать рандомную строку (состоящую из анлийских букв)
GeneratorRandomEngString

4.3* Генерировать рандомное имя (псевдонимы получать из файла)
GeneratorRandomNickPeopleFromFile ->NickPeople.txt

5. Создать компараторы (Comparator) для классов которые сравнивают:
5.1. Длину пароля пользователей
LengthPasswordComparator

5.2. Длину пароля пользователей и псевдонимы пользователей по алфавиту (Смотрите уточнение в пункте 5.99)
LengthPasswordAndNickComparator

5.3. Возраст животных
AgeAnimalComparator

5.4. Возраст животных и клички животных по алфавиту
AgeAnimalAndNickComparator

6. Работа с коллекциями.
Main


++ GeneratorRandomPassword - генерация пароля
++ INumGenerator - числовой генератор
++ GeneratorRandomAgeAnimals - генерация возраста животного
++ Time - обработка времени выполнения операций

