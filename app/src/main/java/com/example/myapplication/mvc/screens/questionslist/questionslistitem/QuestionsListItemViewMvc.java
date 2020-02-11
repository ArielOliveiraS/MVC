package com.example.myapplication.mvc.screens.questionslist.questionslistitem;

import com.example.myapplication.mvc.questions.Question;
import com.example.myapplication.mvc.screens.common.views.ObservableViewMvc;

public interface QuestionsListItemViewMvc extends ObservableViewMvc<QuestionsListItemViewMvc.Listener> {

    public interface Listener {
        void onQuestionClicked(Question question);
    }

    void bindQuestion(Question question);
}
