Коллекции, полиморфизм, DTO, Supplier*, Comparator

1.1. Написать класс Person
package dto: Person

1.2. Написать класс Animal
package dto: Animal

2. Для имён:
2.1 Генерировать рандомную строку (не важно из чего состоит)
package api: IStringGenerator
package generator: GeneratorRandomEngNumString

2.2 Генерировать рандомную строку (состоящую из русских букв)
package generator: GeneratorRandomRusString

2.3 Генерировать рандомное имя (настоящее имя)
package generator: GeneratorRandomName

2.4* Генерировать рандомное имя (имена получать из файла)
package generator: GeneratorRandomNameFromFile <- Name.txt

3. Для клички:
3.1 Генерировать рандомную строку (не важно из чего состоит)
package generator: GeneratorRandomEngNumString

3.2 Генерировать рандомную строку (состоящую из русских букв)
package generator: GeneratorRandomRusString

3.3 Генерировать рандомное имя (настоящие клички животных)
package generator: GeneratorRandomNickAnimal

3.4* Генерировать рандомное имя (клички получать из файла)
package generator: GeneratorRandomNickAnimalFromFile <- NickAnimal.txt

4. Для псевдонимов:
4.1 Генерировать рандомную строку (не важно из чего состоит)
package generator: GeneratorRandomEngNumString

4.2 Генерировать рандомную строку (состоящую из анлийских букв)
package generator: GeneratorRandomEngString

4.3* Генерировать рандомное имя (псевдонимы получать из файла)
package generator: GeneratorRandomNickPeopleFromFile <- NickPeople.txt

5. Создать компараторы (Comparator) для классов которые сравнивают:
5.1. Длину пароля пользователей
package comparator: LengthPasswordComparator

5.2. Длину пароля пользователей и псевдонимы пользователей по алфавиту (Смотрите уточнение в пункте 5.99)
package comparator: LengthPasswordAndNickComparator

5.3. Возраст животных
package comparator: AgeAnimalComparator

5.4. Возраст животных и клички животных по алфавиту
package comparator: AgeAnimalAndNickComparator

6. Работа с коллекциями.
6.0* 6.0* В идеале можно, используя полиморфизм, написать метод который будет выполнять основную работу над коллекциями 
package worker: GlobalJob

6.1. При помощи рандома генерируем 1_000_000 (Если компьютер глючит сделать 100_000) разных объектов одного класса. Поля заполняются рандомными данными.
6.2. Заполняем.
Main
package worker: Creator, FillerCollectionWithTime;

6.3. Отсортировать коллекции. 
6.3.1. Сортируем встроенными средствами jdk
Main
package worker: SorterWithTime;

6.3.2.* Сортируем собственным методом сортировки
Main
package utils: SortUtils;
package worker: SorterWithTime;

6.4. Замерить время и распечатать в консоль скорость каждой перечисленной операции.
Main
package dto: Time;
package worker: FillerCollectionWithTime, IteratorWithTime, RemoverWithTime;

++ package generator: GeneratorRandomPassword - генерация пароля
++ package generator: GeneratorRandomAgeAnimals - генерация возраста животного
++ package api: INumGenerator - числовой генератор
