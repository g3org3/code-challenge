import { ThemeProvider } from '@mui/material/styles'
import { RouterProvider } from 'react-router-dom'
import '@fontsource/roboto/300.css'
import '@fontsource/roboto/400.css'
import '@fontsource/roboto/500.css'
import '@fontsource/roboto/700.css'

import 'config/index.css'
import theme from 'config/theme'
import Layout from './Layout'
import router from 'config/router'

const Root = () => {
  return (
    <ThemeProvider theme={theme}>
      <Layout>
        <RouterProvider router={router} />
      </Layout>
    </ThemeProvider>
  )
}

export default Root
