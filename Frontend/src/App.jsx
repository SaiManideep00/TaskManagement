import Task from "./components/Task";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import GetTasks from "./components/GetTasks";
import UpdateTask from "./components/UpdateTask";
import DeleteTask from "./components/DeleteTask";
import Layout from "./components/Layout";
import Body from "./components/Body";
function App() {
  const appRouter = createBrowserRouter([
    {
      path: "/",
      element: <Layout />,
      children: [
        {
          path: "/",
          element: <Body />,
        },
        {
          path: "/create",
          element: <Task />,
        },
        {
          path: "/get",
          element: <GetTasks />,
        },
        {
          path: "/update",
          element: <UpdateTask />,
        },
        {
          path: "/delete",
          element: <DeleteTask />,
        },
      ],
    },
  ]);
  return (
    <div>
      <RouterProvider router={appRouter} />
    </div>
  );
}

export default App;
