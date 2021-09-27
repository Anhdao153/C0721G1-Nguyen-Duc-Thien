use quanlysinhvien;
select studentname
from student
where studentname like "h%"; 

select startdate
from class
where month(startdate)=12;

select credit
from subject
where credit>5 and credit<10;

update student set classid = 2 where studentname="hung" ;


select student.StudentName, subject.SubName, mark.Mark
from((student
inner join subject on student.StudentId=subject.SubId)
inner join mark on student.StudentId=mark.MarkId)
order by Mark DESC ,StudentName asc;