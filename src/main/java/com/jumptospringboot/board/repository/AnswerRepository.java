package com.jumptospringboot.board.repository;

import com.jumptospringboot.board.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
