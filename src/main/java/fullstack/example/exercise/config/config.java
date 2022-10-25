//package fullstack.example.exercise.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(basePackages = "fullstack.example.exercise.repo")
//public class config {
//    @Bean
//    public DataSource dataSource() {
//        DataSource dataSource = null;
//        Context ctx = null;
//        try {
//            ctx = new InitialContext();
//            dataSource = (DataSource) ctx.lookup("application.property");
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }
//}
