package br.com.adriano.desafio_todolist;


import br.com.adriano.desafio_todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class DesafioTodoListApplicationTests {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTodoSuccess(){
        var todo = new Todo("todo 1", "desc todo 1", false, 1);

            webTestClient
                .post()
                .uri("/todos")
                .bodyValue(todo)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$").isArray()
                .jsonPath("$.length()").isEqualTo(1)



    }

    void testCreateTodoFailure(){

    }
}
