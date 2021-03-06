package io.javabrains.sprinbootstarter.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicCOntroller {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopic()
    {
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topic")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(id, topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}
