[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9886124)
# Виконання практичної на чотири


## Завдання 1. Створення класу з атрибутами

1. **клонуйте** створений для вас репозиторій в Netbeans (детальна інструкція з картинками є [тут](https://netbeans.org/kb/docs/ide/git.html)), **відкрийте** в [Repl.It](https://repl.it/) ([ось](https://repl.it/talk/learn/Configuring-GitHub-repos-to-run-on-Replit-and-contributing-back/23948) покрокова інструкція з картинками) або **просто завантажте** його вміст у ZIP-форматі (скориставшись кнопкою "Code" > "Download ZIP") і відкрийте в IDE за вашим вибором
2. створіть **в пакеті ````domain````** клас ```` Сustomer ```` з такими **приватними атрибутами**:
    * ````ID```` (номер клієнта, **ціле** число)
    * ````isNew```` (статус клієнта новий він чи старий, **булевське** значення)
    * ````total```` (сума замовлень за рік, **дробове** число)
3. атрибути повинні мати **значення за замовчуванням** (наприклад, ````1```` для ````ID````, ````true```` для ````isNew````, ````1000```` для ````total````, див. відеозапис лекції).

![task](https://user-images.githubusercontent.com/112692170/215342027-bc0f0f63-43d8-4aae-949f-e66b21c30a40.png)


## Завдання 2. Додавання в клас методів 

Додати до класу метод ````displayCustomerInfo````, який виводить на консоль інформацію про клієнта з допомогою ````System.out.println````. Кожен рядок має містити відповідну мітку, наприклад, "Total purchases are:"

![task1](https://user-images.githubusercontent.com/112692170/215341299-310df712-b769-40be-a783-6322e48354e8.png)

## Перевірка працездатності створеного класу

1. Створити в **пакеті ````test````** клас ````CustomerTest````, в методі ````main```` якого створити об'єкт класу ```` Сustomer ```` та вивести на екран його властивості з допомогою методу ````displayCustomerInfo```` (див. відеозапис лекції). 

![task1 2](https://user-images.githubusercontent.com/112692170/215341302-a46fbd6d-978e-448d-8023-aa45e143fffe.png)

2. **запустіть** його (<kbd>F6</kbd> у NetBeans для запуску головного виконуваного файлу, <kbd>SHIFT</kbd>+<kbd>F6</kbd> - для запуску поточного файлу)
3. зробіть та збережіть (тека **Solution**) у файл ````done.png```` **скріншот** результатів роботи програми 

![done](https://user-images.githubusercontent.com/112692170/215341304-5e970cb4-0f6d-4e13-94ae-bdeb633d1b93.png)

![done2](https://user-images.githubusercontent.com/112692170/215341297-5684529e-7c40-4d1e-98bd-39e43d791cec.png)



