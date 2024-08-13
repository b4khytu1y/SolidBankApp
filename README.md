
# SOLIDBankApp
<p> Это небольшое банковское приложение на основе диаграммы классов UML (рис 1). Унифицированный язык моделирования - используется в разработке программного обеспечения для визуализации архитектуры приложений. UML помогает программистам создавать и обсуждать с коллегами архитектуру своего приложения и является стандартом индустрии.
<p align="center">
<img  src="https://ucarecdn.com/9c83ab15-eac1-4e21-85a2-ca2770fc2d90/"  width="350" alt="Calculate-BMI-and-risk-category"/>
</p>
<p align="center">рисунок 1. UML диаграмма классов</p> 
<p><b>SOLID - это аббревиатура из пяти принципов, которую описал в свое время Роберт Мартин:</b></p>


 <ul>
    <li>S (single responsibility principle, принцип единственной ответственности) — определенный класс/модуль должен решать только определенную задачу, максимально узко, но максимально хорошо. Если для выполнения своей задачи ему требуются какие-то другие ресурсы — они в него должны быть инкапсулированы (это отсылка к принципу инверсии зависимостей)</li>
    <li>O (open-closed principle, принцип открытости/закрытости) — классы/модули должны быть открыты для расширения, но закрыты для модификации. Должна быть возможность расширить поведение, наделить новым функционалом, но при этом исходный код/логика модуля должна быть неизменной Гена</li>
    <li>L (Liskov substitution principle, принцип подстановки Лискова) — поведение наследующих классов не должно противоречить поведению, заданному базовым классом, то есть поведение наследующих классов должно быть ожидаемым для кода</li>
    <li>I (interface segregation principle, принцип разделения интерфейса) — интерфейс с несколькими методами лучше чем интерфейс с большим количеством методов</li>
    <li>D (dependency inversion principle, принцип инверсии зависимостей) — "завязываться" на абстракциях (интерфейсах), а не конкретных реализациях. Так же (это уже про IoC, но всё же) можно сказать, что если какому-то классу для своей работы требуется функциональность другого — есть смысл "запрашивать" её в конструкторе нашего класса используя интерфейс, под который подходит наша зависимость. Таким образом, целевая реализация опирается только на интерфейсы (не зависит от реализаций) и соответствует принципу под буквой S</li>
  </ul>
