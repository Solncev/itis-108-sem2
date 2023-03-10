plugins {
    id("java")
    id("org.springframework.boot") version "2.7.8"
}

apply(plugin = "io.spring.dependency-management")

group = "com.solncev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

    //db
    implementation("org.postgresql:postgresql:42.5.3")

    //lombok
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    //webjars
    implementation ("org.webjars:jquery:3.6.0")
    implementation ("org.webjars:bootstrap:4.6.0")
    implementation ("org.webjars:webjars-locator-core:0.46")

    //test
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}