import React from 'react';
import { useParams } from 'react-router-dom';
import trainers from './trainersMock';

function TrainerDetail() {
  const { id } = useParams();
  const trainer = trainers.find(t => t.trainerId === id);

  if (!trainer) return <div>Trainer not found</div>;

  return (
    <div>
      <h3>Trainers Details</h3>
      <strong>{trainer.name} ({trainer.technology})</strong>
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>
      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetail;
