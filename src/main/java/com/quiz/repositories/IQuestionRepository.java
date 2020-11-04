package com.quiz.repositories;

import com.quiz.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<Question, Integer> {
}
