## Информация о проекте
Данный [проект](https://github.com/Shchelokoff/JavaCoreHW3/tree/main/src/ru/mvc/javacorehw3) был создан на основание MVC (Model-View-Controller) - это шаблон проектирования, 
который используется для разделения слоев приложения на три компонента: модель (Model), 
представление (View) и контроллер (Controller).

## Задание
1. Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.
2. (Код пишется на основе задачек из презентации.) Опишите класс руководителя, наследник от сотрудника. 
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, 
чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof). 
В основной программе создайте руководителя и поместите его в общий массив сотрудников. 
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

## Результат выполнения программного кода проекта:
```
Список сотрудников до повышения заработной платы:
Employee{name='Max', salary=100.0, age=25.0}
Employee{name='Lena', salary=200.0, age=25.0}
Employee{name='Vova', salary=300.0, age=25.0}
Employee{name='Hariton', salary=500.0, age=25.0}
Employee{name='Durov', salary=10000.0, age=50.0}

Список сотрудников после повышения заработной платы:
Employee{name='Max', salary=10100.0, age=25.0}
Employee{name='Lena', salary=10200.0, age=25.0}
Employee{name='Vova', salary=10300.0, age=25.0}
Employee{name='Hariton', salary=10500.0, age=25.0}
Employee{name='Durov', salary=10000.0, age=50.0}

Список сотрудников после сортировки по заработной плате:
Employee{name='Durov', salary=10000.0, age=50.0}
Employee{name='Max', salary=10100.0, age=25.0}
Employee{name='Lena', salary=10200.0, age=25.0}
Employee{name='Vova', salary=10300.0, age=25.0}
Employee{name='Hariton', salary=10500.0, age=25.0}
```
