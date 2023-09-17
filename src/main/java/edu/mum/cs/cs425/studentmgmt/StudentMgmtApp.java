package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.util.Collections;

public class StudentMgmtApp implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
        Transcript t = new Transcript("BS Computer Science");
        saveTranscript(t);
        s.setTranscript(Collections.singletonList(t));
        Classroom l = new Classroom("McLaughlin building", "M105");
        saveClassroom(l);
        s.setClassroom(Collections.singletonList(l));
        saveStudent(s);

    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void saveTranscript(Transcript transcript) {
        transcriptRepository.save(transcript);
    }

    public void saveClassroom(Classroom classroom) {
        classroomRepository.save(classroom);
    }
}
