plugins {}

version = "0.0.1"

dependencies {
    // spring-boot-starter-web
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")

    implementation("io.springfox:springfox-boot-starter:3.0.0")

    implementation(project(":domain"))
    implementation(project(":kafka"))

    //test
    testImplementation("io.mockk:mockk:1.12.0")
    runtimeOnly("com.h2database:h2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.+") //mapper 관련

    // AOP
    implementation("org.springframework.boot:spring-boot-starter-aop")

    // Logging - 코틀린 로그 라이브러리 - 지연연산 가능!
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")
}