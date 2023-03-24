import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testClone() {
        Livro livro = new Livro("Como eu era antes de você",
                new Autor("Jojo Moyes", "britânica"),
                "Intriseca",
                1,
                2012);

        Livro livroClone = livro.clone();
        livroClone.setTitulo("Depois de você");
        livroClone.setAno(2015);

        assertEquals("Livro{titulo='Como eu era antes de você', autor=Autor{nome='Jojo Moyes', nacionalidade='britânica'}, " +
                "editora='Intriseca', edicao=1, ano=2012}", livro.toString());
        assertEquals("Livro{titulo='Depois de você', autor=Autor{nome='Jojo Moyes', nacionalidade='britânica'}, " +
                "editora='Intriseca', edicao=1, ano=2015}", livroClone.toString());
    }
}