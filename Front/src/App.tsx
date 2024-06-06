import { BrowserRouter as Router } from "react-router-dom"
import AppRoutes from "./routes/AppRoutes"
import "react-toastify/dist/ReactToastify.css";
import Sidebar from "./components/SideBar/Sidebar";

export default function App() {

  return (
    <>
      <Router>
        <div className="container-fluid p-0">
          <div className="row">
            <div className="col-md-2">
              <Sidebar></Sidebar>
            </div>
            <div className="col-md-10 d-flex flex-column justify-content-between p-0 m-0">
              <div className="row">
                <div className="col-md-12">
                  <AppRoutes />
                </div>
              </div>
              <div className="row justify-content-between align-items-end">
                <div className="col-md-12 m-0 p-0">

                </div>
              </div>
            </div>

          </div>
        </div>
      </Router>


    </>
  )
}

/*
<ToastContainer />
      <Router>
      <Container fluid>
        <Row>
          <Col sm={3} md={2} lg={2}>
            <Sidebar />
          </Col>
          <Col sm={9} md={10} lg={10}>
            <Container>
              <AppRoutes />
            </Container>
          </Col>
        </Row>
        <Row>
          <Col>
            <Footer />
          </Col>
        </Row>
      </Container>
    </Router>
*/