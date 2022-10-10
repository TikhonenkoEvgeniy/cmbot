package com.tikhonenko.cmbot.repos;

import com.tikhonenko.cmbot.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {

}
