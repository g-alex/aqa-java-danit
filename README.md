# aqa-java-danit

Учебные проекты курса AQA (Dan.It Education).

**Стек:** Java 26 · Maven · TestNG · JUnit 4 · Selenide (Selenium WebDriver) · REST Assured · Cucumber BDD · Allure · TestRail API

## Структура

| Пакет | Что это |
|---|---|
| `hw_1` – `hw_12` | Java-core: ООП, наследование, интерфейсы, коллекции, исключения, try-with-resources |
| `aqa_hw_2` | API-тесты (REST Assured): CRUD для petstore.swagger.io + DTO |
| `aqa_hw_3` – `aqa_hw_5` | Локаторы (CSS/XPath), явные/неявные/fluent ожидания |
| `aqa_hw_7` | TestNG: группы, дата-провайдеры, листенеры |
| `aqa_hw_8` – `aqa_hw_11` | UI-автотесты (Selenide + Page Object): поиск, корзина, логин, подписка, TestRail-интеграция |
| `aqa_hw_12` | Cucumber BDD: `.feature`-файлы + step definitions |
| `final_project` | Финальный проект курса — UI-тесты ksd.ua (снапшот, см. ниже) |

## Финальный проект

Актуальная версия финального проекта вынесена в отдельный репозиторий как полноценный
тестовый фреймворк: **[ksd-test-framework](https://github.com/g-alex/ksd-test-framework)** —
Selenide + TestNG + Allure + TestRail API, со своей инструкцией запуска.
Здесь — снапшот на момент сдачи курса.

## Запуск

Требуется JDK 26 и Maven.

```bash
mvn test                # финальный проект (default suite)
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suites/runnerpositive.xml   # другой сьют
allure serve target/allure-results   # Allure-отчёт
```

TestRail-интеграция опциональна и включается переменными окружения:
`TESTRAIL_EMAIL`, `TESTRAIL_API_KEY` (без них тесты выполняются, отправка результатов пропускается).
