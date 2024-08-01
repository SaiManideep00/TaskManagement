import React from "react";
import { Link } from "react-router-dom";
function Body() {
  return (
    <div>
      <div className="p-4 m-4 flex justify-center">
        <Link to="/create">
          <button className="p-4 m-4 border-2 w-30 bg-gray-300">
            Create a Task
          </button>
        </Link>
        <Link to="/get">
          <button className="p-4 m-4 border-2 bg-gray-300 w-30">
            Get Tasks
          </button>
        </Link>
        <Link to="/update">
          <button className="p-4 m-4 border-2 bg-gray-300 w-30">
            Update Task
          </button>
        </Link>
        <Link to="/delete">
          <button className="p-4 m-4 border-2 bg-gray-300 w-30">
            Delete Task
          </button>
        </Link>
      </div>
    </div>
  );
}

export default Body;
