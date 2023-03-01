import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class App {

    App() throws IOException {
        CustomHTTPClient client = new CustomHTTPClient();

        JFrame frame = new JFrame();
        JLabel setup = new JLabel();
        JLabel delivery = new JLabel();

        JPanel jokePanel = new JPanel(new GridLayout(2,1));

        try{
            JokeDTO dto = formatJoke(getJoke(client.URL));
            setup.setText(dto.getSetup());
            delivery.setText(dto.getDelivery());
        }catch(InvalidTypeIdException e){
            e.printStackTrace();
        }

        jokePanel.add(setup);
        jokePanel.add(delivery);

        frame.setTitle("Joke Of The Day!");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jokePanel);

        frame.getContentPane().setBackground(new Color(255,105,180));

        frame.setVisible(true);
    }

    public JokeDTO formatJoke(String jsonString) throws JsonProcessingException {
      ObjectMapper objectMapper = new ObjectMapper();

      JokeDTO joke = objectMapper.readValue(jsonString, JokeDTO.class);

      return joke;
    }

    public String getJoke(String URL) throws IOException {
        CustomHTTPClient client = new CustomHTTPClient();

        return client.sendGET(URL);
    }
}
