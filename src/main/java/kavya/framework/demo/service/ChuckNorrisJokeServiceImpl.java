package kavya.framework.demo.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes ;

    public ChuckNorrisJokeServiceImpl()
    {
        chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    public String getJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
