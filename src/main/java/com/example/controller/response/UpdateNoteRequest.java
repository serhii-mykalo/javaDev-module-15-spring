package com.example.controller.response;

import com.example.controller.request.NoteRequest;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
public class UpdateNoteRequest extends NoteRequest {

    public UpdateNoteRequest () {}

    public UpdateNoteRequest (String title, String content) {
        super(title, content);
    }
}
